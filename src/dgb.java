import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dgh {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final duu b = duq.P;
   public static final dur c = duq.u;

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dqx $$5) {
         $$3.a($$5);
         $$3.a(awn.ar);
         cmg.a($$3, true);
      }

      return brk.a;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      dre $$4 = $$1.c_($$2);
      if ($$4 instanceof dqx) {
         ((dqx)$$4).k();
      }
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dqx($$0, $$1);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.d().g());
   }
}
