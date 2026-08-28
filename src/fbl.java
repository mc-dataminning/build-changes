import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fbl extends fbb {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezm.e.fieldOf("component").forGetter($$0x -> $$0x.b), fac.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbl::new)
   );
   private final ezl<?> b;
   private final List<fae> c;

   fbl(List<fcx> $$0, ezl<?> $$1, List<fae> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbd<fbl> b() {
      return fbe.t;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<czk> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ezt.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fbl.a a(ezl<?> $$0) {
      return new fbl.a($$0);
   }

   public static class a extends fbb.a<fbl.a> {
      private final com.google.common.collect.ImmutableList.Builder<fae> a = ImmutableList.builder();
      private final ezl<?> b;

      public a(ezl<?> $$0) {
         this.b = $$0;
      }

      protected fbl.a a() {
         return this;
      }

      public fbl.a a(fae.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbc b() {
         return new fbl(this.g(), this.b, this.a.build());
      }
   }
}
