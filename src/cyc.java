import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyc extends cwb implements ddp {
   public static final MapCodec<cyc> a = b(cyc::new);
   public static final djx b = djw.C;
   private static final int d = 3;
   protected static final eml c = cwp.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   public cyc(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.z, $$0.B ? dhg::a : dhg::b);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.b;
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(b) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dgp) {
            ((dgp)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(asl.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
