import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckc extends ciu {
   private static final String b = "Johnny";
   static final Predicate<bqa> e = $$0 -> $$0 == bqa.c || $$0 == bqa.d;
   boolean ca;

   public ckc(bsj<? extends ckc> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new ckc.a(this));
      this.bU.a(2, new ciu.b(this));
      this.bU.a(3, new cnt.a(this, 10.0F));
      this.bU.a(4, new cag(this, 1.0, false));
      this.bV.a(1, new cbo(this, cnt.class).a());
      this.bV.a(2, new cbp<>(this, cmh.class, true));
      this.bV.a(3, new cbp<>(this, clp.class, true));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
      this.bV.a(4, new ckc.b(this));
      this.bU.a(8, new cat(this, 0.6));
      this.bU.a(9, new cae(this, cmh.class, 3.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gc() && cdu.a(this)) {
         boolean $$0 = ((aqk)this.dP()).e(this.dp());
         ((ccj)this.K()).b($$0);
      }

      super.Z();
   }

   public static buf.a u() {
      return cjn.gt().a(bug.v, 0.35F).a(bug.m, 12.0).a(bug.s, 24.0).a(bug.c, 5.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.ca) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ciu.a s() {
      if (this.ge()) {
         return ciu.a.b;
      } else {
         return this.gG() ? ciu.a.g : ciu.a.a;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.ca = $$0.q("Johnny");
      }
   }

   @Override
   public ave ae_() {
      return avf.Bm;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      btr $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccj)this.K()).b(true);
      aym $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      if (this.gB() == null) {
         this.a(bsk.a, new cua(cud.pd));
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      if (!this.ca && $$0 != null && $$0.getString().equals("Johnny")) {
         this.ca = true;
      }
   }

   @Override
   protected ave v() {
      return avf.Bl;
   }

   @Override
   protected ave o_() {
      return avf.Bn;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.Bo;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cua $$2 = new cua(cud.pd);
      cns $$3 = this.gB();
      boolean $$4 = this.ah.i() <= $$3.v();
      if ($$4) {
         akj<daq> $$5 = $$0 > $$3.a(bqa.c) ? daw.f : daw.e;
         czl.a($$2, $$5, this.dP(), this.dp(), this.ah);
      }

      this.a(bsk.a, $$2);
   }

   static class a extends bzg {
      public a(bta $$0) {
         super($$0, 6, ckc.e);
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean b() {
         ckc $$0 = (ckc)this.d;
         return $$0.gE() && super.b();
      }

      @Override
      public boolean a() {
         ckc $$0 = (ckc)this.d;
         return $$0.gE() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends cbp<bsy> {
      public b(ckc $$0) {
         super($$0, bsy.class, 0, true, true, bsy::fD);
      }

      @Override
      public boolean a() {
         return ((ckc)this.e).ca && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
