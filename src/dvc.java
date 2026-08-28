import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class dvc extends dty implements fcl.a {
   public static final String b = "RecordItem";
   public static final String c = "ticks_since_song_started";
   private cwo d = cwo.j;
   private final cwv e = new cwv(this::k, this.aA_());

   public dvc(ji $$0, dww $$1) {
      super(dua.e, $$0, $$1);
   }

   public cwv j() {
      return this.e;
   }

   public void k() {
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   private void a(boolean $$0) {
      if (this.o != null && this.o.a_(this.aA_()) == this.m()) {
         this.o.a(this.aA_(), this.m().b(dnq.b, Boolean.valueOf($$0)), 2);
         this.o.a(ebs.c, this.aA_(), ebs.a.a(this.m()));
      }
   }

   public void s() {
      if (this.o != null && !this.o.C) {
         ji $$0 = this.aA_();
         cwo $$1 = this.f();
         if (!$$1.f()) {
            this.h();
            faz $$2 = faz.a($$0, 0.5, 1.01, 0.5).a(this.o.A, 0.7F);
            cwo $$3 = $$1.v();
            clb $$4 = new clb(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(dgh $$0, ji $$1, dww $$2, dvc $$3) {
      $$3.e.b($$0, $$2);
   }

   public int u() {
      return cwu.a(this.o.K_(), this.d).map(jr::a).map(cwu::e).orElse(0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cwo.a($$1, (un)$$0.p("RecordItem")).orElse(cwo.j);
      } else {
         if (!this.d.f()) {
            this.e.a(this.o, this.m());
         }

         this.d = cwo.j;
      }

      if ($$0.b("ticks_since_song_started", 4)) {
         cwu.a($$1, this.d).ifPresent($$1x -> this.e.a($$1x, $$0.i("ticks_since_song_started")));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.f().f()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      if (this.e.b() != null) {
         $$0.a("ticks_since_song_started", this.e.c());
      }
   }

   @Override
   public cwo f() {
      return this.d;
   }

   @Override
   public cwo c(int $$0) {
      cwo $$1 = this.d;
      this.b(cwo.j);
      return $$1;
   }

   @Override
   public void b(cwo $$0) {
      this.d = $$0;
      boolean $$1 = !this.d.f();
      Optional<jr<cwu>> $$2 = cwu.a(this.o.K_(), this.d);
      this.a($$1);
      if ($$1 && $$2.isPresent()) {
         this.e.a(this.o, $$2.get());
      } else {
         this.e.a(this.o, this.m());
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public dty t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cwo $$1) {
      return $$1.b(kv.ab) && this.a($$0).f();
   }

   @Override
   public boolean a(bsc $$0, int $$1, cwo $$2) {
      return $$0.a_(cwo::f);
   }

   @VisibleForTesting
   public void c(cwo $$0) {
      this.d = $$0;
      cwu.a(this.o.K_(), $$0).ifPresent($$0x -> this.e.a($$0x, 0L));
      this.o.a(this.aA_(), this.m().b());
      this.e();
   }

   @VisibleForTesting
   public void v() {
      cwu.a(this.o.K_(), this.f()).ifPresent($$0 -> this.e.a(this.o, (jr<cwu>)$$0));
   }
}
