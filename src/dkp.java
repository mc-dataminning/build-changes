import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkp extends dmz {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dkp::new)
   );
   public static final dyh b = dyg.A;
   private final dyf d;
   private final int f;
   private final Function<dxq, fcr> g;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(dyf $$0, int $$1, dxp.d $$2) {
      super($$2.a($$0.g()));
      this.d = $$0;
      this.l(this.B.b().b(e, jn.c).b(b, Boolean.valueOf(false)).b(c, dyb.b));
      this.f = $$1;
      this.g = this.b();
   }

   private Function<dxq, fcr> b() {
      fcr $$0 = dke.a(14.0);
      fcr $$1 = dke.a(12.0);
      Map<dyb, Map<jn, fcr>> $$2 = fco.e(dke.b(6.0, 4.0, 8.0, 16.0));
      return this.a($$3 -> fco.a($$2.get($$3.c(c)).get($$3.c(e)), $$3.c(b) ? $$0 : $$1, fcb.e));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$0.c(b)) {
         return bsy.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsy.a;
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dxq $$0, dgz $$1, ji $$2, @Nullable cpr $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.f);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ecp.a, $$2);
   }

   protected void a(@Nullable cpr $$0, dha $$1, ji $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awb.e);
   }

   protected avz a(boolean $$0) {
      return $$0 ? this.d.o() : this.d.n();
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.C && this.d.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dxq $$0, dgz $$1, ji $$2) {
      cpy $$3 = this.d.e() ? $$1.a(cpy.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ecp.a : ecp.e, $$2);
      }

      if ($$4) {
         $$1.a(new ji($$2), this, this.f);
      }
   }

   private void e(dxq $$0, dgz $$1, ji $$2) {
      jn $$3 = n($$0).g();
      eve $$4 = eva.a($$1, $$3, $$3.o().d() ? jn.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, b, c);
   }
}
