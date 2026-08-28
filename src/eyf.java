import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eyf extends exv {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewg.e.fieldOf("component").forGetter($$0x -> $$0x.b), eww.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyf::new)
   );
   private final ewf<?> b;
   private final List<ewy> c;

   eyf(List<ezr> $$0, ewf<?> $$1, List<ewy> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exx<eyf> b() {
      return exy.t;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cxg> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ewn.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eyf.a a(ewf<?> $$0) {
      return new eyf.a($$0);
   }

   public static class a extends exv.a<eyf.a> {
      private final com.google.common.collect.ImmutableList.Builder<ewy> a = ImmutableList.builder();
      private final ewf<?> b;

      public a(ewf<?> $$0) {
         this.b = $$0;
      }

      protected eyf.a a() {
         return this;
      }

      public eyf.a a(ewy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exw b() {
         return new eyf(this.g(), this.b, this.a.build());
      }
   }
}
