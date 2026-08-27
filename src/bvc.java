import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvc extends buz implements bgy<he<bvd>> {
   private static final aby<he<bvd>> f = acb.a(bvc.class, aca.y);
   private static final acp<bvd> g = bve.a;
   public static final String e = "variant";

   private static he<bvd> k() {
      return jb.m.f(g);
   }

   public bvc(bfn<? extends bvc> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.am.a(f, k());
   }

   @Override
   public void a(aby<?> $$0) {
      if (f.equals($$0)) {
         this.s();
      }
   }

   public void a(he<bvd> $$0) {
      this.am.b(f, $$0);
   }

   public he<bvd> j() {
      return this.am.b(f);
   }

   public static Optional<bvc> a(cmm $$0, gu $$1, ha $$2) {
      bvc $$3 = new bvc($$0, $$1);
      List<he<bvd>> $$4 = new ArrayList<>();
      jb.m.c(anf.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.t();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(bvc::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<he<bvd>> $$6 = ac.b($$4, $$3.af);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.a($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int b(he<bvd> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private bvc(cmm $$0, gu $$1) {
      super(bfn.ar, $$0, $$1);
   }

   public bvc(cmm $$0, gu $$1, ha $$2, he<bvd> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qr $$0) {
      a($$0, this.j());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qr $$0) {
      he<bvd> $$1 = c($$0).orElseGet(bvc::k);
      this.a($$1);
      this.d = ha.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qr $$0, he<bvd> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<he<bvd>> c(qr $$0) {
      return Optional.ofNullable(acq.a($$0.l("variant"))).map($$0x -> acp.a(jc.P, $$0x)).flatMap(jb.m::b);
   }

   @Override
   public int v() {
      return this.j().a().a();
   }

   @Override
   public int w() {
      return this.j().a().b();
   }

   @Override
   public void a(@Nullable bfj $$0) {
      if (this.dI().X().b(cmi.h)) {
         this.a(amh.qI, 1.0F, 1.0F);
         if ($$0 instanceof byo $$1 && $$1.fO().d) {
            return;
         }

         this.a(cgc.pl);
      }
   }

   @Override
   public void x() {
      this.a(amh.qJ, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public eei dh() {
      return eei.a(this.c);
   }

   @Override
   public uo<ur> S() {
      return new us(this, this.d.d(), this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(ha.a($$0.n()));
   }

   @Override
   public cfz dv() {
      return new cfz(cgc.pl);
   }
}
