import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class exn extends exd {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evo.e.fieldOf("component").forGetter($$0x -> $$0x.b), ewe.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, exn::new)
   );
   private final evn<?> b;
   private final List<ewg> c;

   exn(List<eyz> $$0, evn<?> $$1, List<ewg> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exf<exn> b() {
      return exg.t;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwo> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(evv.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static exn.a a(evn<?> $$0) {
      return new exn.a($$0);
   }

   public static class a extends exd.a<exn.a> {
      private final com.google.common.collect.ImmutableList.Builder<ewg> a = ImmutableList.builder();
      private final evn<?> b;

      public a(evn<?> $$0) {
         this.b = $$0;
      }

      protected exn.a a() {
         return this;
      }

      public exn.a a(ewg.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exe b() {
         return new exn(this.g(), this.b, this.a.build());
      }
   }
}
