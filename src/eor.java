import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eor extends eos {
   public static final MapCodec<eor> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter($$0x -> $$0x.b),
               ayu.l.fieldOf("radius").orElse(2).forGetter($$0x -> $$0x.c),
               ayu.l.fieldOf("height").orElse(1).forGetter($$0x -> $$0x.d),
               eny.a.fieldOf("block_state_provider").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eor::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final eny e;

   public eor(int $$0, int $$1, int $$2, eny $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected eot<?> a() {
      return eot.i;
   }

   @Override
   public void a(eos.a $$0) {
      List<iv> $$1 = elf.a($$0);
      if (!$$1.isEmpty()) {
         iv $$2 = $$1.getFirst();
         int $$3 = $$2.v();
         int $$4 = $$2.u();
         int $$5 = $$2.u();
         int $$6 = $$2.w();
         int $$7 = $$2.w();

         for (iv $$8 : $$1) {
            if ($$8.v() == $$3) {
               $$4 = Math.min($$4, $$8.u());
               $$5 = Math.max($$5, $$8.u());
               $$6 = Math.min($$6, $$8.w());
               $$7 = Math.max($$7, $$8.w());
            }
         }

         azv $$9 = $$0.b();
         era $$10 = new era($$4, $$3, $$6, $$5, $$3, $$7).c(this.c, this.d, this.c);
         iv.a $$11 = new iv.a();

         for (int $$12 = 0; $$12 < this.b; $$12++) {
            $$11.d($$9.a($$10.h(), $$10.k()), $$9.a($$10.i(), $$10.l()), $$9.a($$10.j(), $$10.m()));
            this.a($$0, $$11);
         }
      }
   }

   private void a(eos.a $$0, iv $$1) {
      iv $$2 = $$1.d();
      if ($$0.a().a($$2, $$0x -> $$0x.l() || $$0x.a(dmo.fx)) && $$0.a($$1, ean.a::s)) {
         $$0.a($$2, this.e.a($$0.b(), $$2));
      }
   }
}
