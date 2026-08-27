import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dbc extends cwp implements ddp {
   public static final MapCodec<dbc> a = b(dbc::new);
   public static final int b = 15;
   public static final dkg c = djw.aP;
   public static final djx d = djw.C;
   public static final ToIntFunction<djg> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bka.a;
      } else {
         return bka.b;
      }
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$3.a(cna.hB) ? emi.b() : emi.a();
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return true;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   public float d(djg $$0, csu $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(d) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cmx a(cmx $$0, int $$1) {
      if ($$1 != 15) {
         sn $$2 = new sn();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
