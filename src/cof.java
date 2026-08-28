import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cof extends cob {
   private static final int ca = 50;
   private static final float cb = 0.35F;
   private static final int cc = 7;
   private static final double cd = 12.0;
   protected static final ImmutableList<cgi<? extends cgh<? super cof>>> d = ImmutableList.of(cgi.c, cgi.d, cgi.b, cgi.f, cgi.m);
   protected static final ImmutableList<cfb<?>> bZ = ImmutableList.of(
      cfb.n, cfb.v, cfb.g, cfb.h, cfb.k, cfb.l, cfb.ao, cfb.an, cfb.x, cfb.y, cfb.m, cfb.E, new cfb[]{cfb.o, cfb.p, cfb.q, cfb.t, cfb.ab, cfb.M, cfb.b}
   );

   public cof(bvi<? extends cof> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 20;
   }

   public static bxe.a t() {
      return cmo.gt().a(bxf.s, 50.0).a(bxf.v, 0.35F).a(bxf.c, 7.0).a(bxf.m, 12.0);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      cog.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      this.a(bvj.a, new cxg(cxk.pE));
   }

   @Override
   protected bwz.b<cof> ed() {
      return bwz.a(bZ, d);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cog.a(this, this.ed().a($$0));
   }

   @Override
   public bwz<cof> ec() {
      return (bwz<cof>)super.ec();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      return $$1.a(cxk.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cog.b(this);
      cog.c(this);
      super.a($$0);
   }

   @Override
   public coe gp() {
      return this.gd() && this.gq() ? coe.a : coe.f;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvx $$4) {
         cog.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awu u() {
      return awv.up;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.us;
   }

   @Override
   protected awu o_() {
      return awv.ur;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.ut, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(awv.uq);
   }

   @Override
   protected void gr() {
      this.b(awv.uu);
   }
}
