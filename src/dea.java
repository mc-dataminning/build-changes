import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dea extends dhw {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dsx b = diw.aE;
   private static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewl d = dfa.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewl e = dfa.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewl f = dfa.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewl g = dfa.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewl h = dfa.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewl i = dfa.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewl j = ewi.a(c, d, e, f);
   private static final ewl k = ewi.a(c, g, h, i);
   private static final xp l = xp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aC);
         return bqv.c;
      }
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new cpx($$2x, $$3, cqg.a($$1, $$2)), l);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cjh $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, dsd $$3, cjh $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, cjh $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bro a(bsv $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dsd e(dsd $$0) {
      if ($$0.a(dfc.gS)) {
         return dfc.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfc.gT) ? dfc.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   public int b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
