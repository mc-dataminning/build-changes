import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drx extends dqa {
   public static final MapCodec<drx> a = b(drx::new);
   public static final ebx b = ebw.A;
   private final Function<ebg, fgm> d;

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   protected drx(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(b, Boolean.valueOf(false)).b(c, ebr.b));
      this.d = this.b();
   }

   private Function<ebg, fgm> b() {
      Map<ebr, Map<jc, fgm>> $$0 = fgj.e(dne.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ecj[]{b});
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.C) {
         ebg $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return but.a;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(ebg $$0, djz $$1, iw $$2, @Nullable crz $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? egg.a : egg.e, $$2);
   }

   protected static void a(@Nullable crz $$0, dka $$1, iw $$2, ebg $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awr.oG, aws.e, 0.3F, $$4);
   }

   private static void a(ebg $$0, dka $$1, iw $$2, float $$3) {
      jc $$4 = $$0.c(e).g();
      jc $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lu(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   private void d(ebg $$0, djz $$1, iw $$2) {
      jc $$3 = n($$0).g();
      eyy $$4 = eyu.a($$1, $$3, $$3.o().d() ? jc.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, e, b);
   }
}
