import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bxh extends bxd {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bqg<? extends bqf<? super bxh>>> bT = ImmutableList.of(bqg.c, bqg.d, bqg.b, bqg.f, bqg.l);
   protected static final ImmutableList<bpb<?>> bU = ImmutableList.of(
      bpb.n, bpb.v, bpb.g, bpb.h, bpb.k, bpb.l, bpb.an, bpb.am, bpb.x, bpb.y, bpb.m, bpb.E, new bpb[]{bpb.o, bpb.p, bpb.q, bpb.t, bpb.aa, bpb.L, bpb.b}
   );

   public bxh(bfn<? extends bxh> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bhf.a w() {
      return bwc.ge().a(bhg.a, 50.0).a(bhg.d, 0.35F).a(bhg.f, 7.0);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      bxi.a(this);
      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      this.a(bfo.a, new cfz(cgc.ok));
   }

   @Override
   protected bha.b<bxh> dL() {
      return bha.a(bU, bT);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      return bxi.a(this, this.dL().a($$0));
   }

   @Override
   public bha<bxh> dK() {
      return (bha<bxh>)super.dK();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean k(cfz $$0) {
      return $$0.a(cgc.ok) ? super.k($$0) : false;
   }

   @Override
   protected void W() {
      this.dI().ad().a("piglinBruteBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      bxi.b(this);
      bxi.c(this);
      super.W();
   }

   @Override
   public bxg ga() {
      return this.fS() && this.gb() ? bxg.a : bxg.f;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dI().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bfz) {
            bxi.a(this, (bfz)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected amg s() {
      return amh.sd;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.sg;
   }

   @Override
   protected amg g_() {
      return amh.sf;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.sh, 0.15F, 1.0F);
   }

   protected void gf() {
      this.a(amh.se, 1.0F, this.eS());
   }

   @Override
   protected void gc() {
      this.a(amh.si, 1.0F, this.eS());
   }
}
