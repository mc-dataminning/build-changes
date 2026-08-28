import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dql extends dop {
   public static final MapCodec<dql> a = b(dql::new);
   public static final eaf b = eae.A;
   private final Function<dzo, feq> d;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   protected dql(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, dzz.b));
      this.d = this.b();
   }

   private Function<dzo, feq> b() {
      Map<dzz, Map<ja, feq>> $$0 = fen.e(dlu.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ear[]{b});
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.C) {
         dzo $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bty.a;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dzo $$0, dip $$1, iu $$2, @Nullable cqs $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? eeo.a : eeo.e, $$2);
   }

   protected static void a(@Nullable cqs $$0, diq $$1, iu $$2, dzo $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awl.oC, awm.e, 0.3F, $$4);
   }

   private static void a(dzo $$0, diq $$1, iu $$2, float $$3) {
      ja $$4 = $$0.c(e).g();
      ja $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ls(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   private void d(dzo $$0, dip $$1, iu $$2) {
      ja $$3 = n($$0).g();
      exd $$4 = ewz.a($$1, $$3, $$3.o().d() ? ja.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, e, b);
   }
}
