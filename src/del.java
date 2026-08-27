import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class del extends cwp {
   public static final MapCodec<del> a = b(del::new);
   private static final vf d = vf.c("container.stonecutter");
   public static final dka b = dak.aE;
   protected static final eml c = cwp.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.ay);
         return bka.b;
      }
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cjz($$2x, $$3, cil.a($$1, $$2)), d);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
