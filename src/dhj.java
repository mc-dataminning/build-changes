import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhj extends dhu {
   private final dhk n;
   private final boolean o;

   public dhj(dhk $$0, boolean $$1) {
      super($$0.f(), dhx.a, $$0.l, $$0.F().G_().d(jc.aq), $$0.t());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public dcz c_(gw $$0) {
      return this.n.c_($$0);
   }

   @Override
   public dfd a_(gw $$0) {
      return this.n.a_($$0);
   }

   @Override
   public eag b_(gw $$0) {
      return this.n.b_($$0);
   }

   @Override
   public int M() {
      return this.n.M();
   }

   @Override
   public dhl b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public dfd a(gw $$0, dfd $$1, boolean $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(dcz $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(biw $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(dhe $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public dhl[] d() {
      return this.n.d();
   }

   @Override
   public void a(dkm.a $$0, long[] $$1) {
   }

   private dkm.a c(dkm.a $$0) {
      if ($$0 == dkm.a.a) {
         return dkm.a.b;
      } else {
         return $$0 == dkm.a.c ? dkm.a.d : $$0;
      }
   }

   @Override
   public dkm a(dkm.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(dkm.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cpi f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public dvk a(dvc $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(dvc $$0, dvk $$1) {
   }

   @Override
   public Map<dvc, dvk> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<dvc, dvk> $$0) {
   }

   @Override
   public LongSet b(dvc $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(dvc $$0, long $$1) {
   }

   @Override
   public Map<dvc, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<dvc, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public dhe j() {
      return this.n.j();
   }

   @Override
   public void d(gw $$0) {
   }

   @Override
   public void e(gw $$0) {
   }

   @Override
   public void a(qw $$0) {
   }

   @Nullable
   @Override
   public qw f(gw $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public qw g(gw $$0) {
      return this.n.g($$0);
   }

   @Override
   public void a(Predicate<dfd> $$0, BiConsumer<gw, dfd> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public eiw<ctc> o() {
      return this.o ? this.n.o() : eim.a();
   }

   @Override
   public eiw<eaf> p() {
      return this.o ? this.n.p() : eim.a();
   }

   @Override
   public dgz.a q() {
      return this.n.q();
   }

   @Nullable
   @Override
   public dlp t() {
      return this.n.t();
   }

   @Override
   public void a(dlp $$0) {
      this.n.a($$0);
   }

   @Override
   public dgy a(dki.a $$0) {
      if (this.o) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public dgy b(dki.a $$0) {
      if (this.o) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ac.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public dhk C() {
      return this.n;
   }

   @Override
   public boolean v() {
      return this.n.v();
   }

   @Override
   public void b(boolean $$0) {
      this.n.b($$0);
   }

   @Override
   public void a(crc $$0, cri.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void A() {
      this.n.A();
   }

   @Override
   public dzq B() {
      return this.n.B();
   }
}
