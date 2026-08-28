import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dpw extends dpn implements bpw {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final js<cua> d = js.a(6, cua.l);
   private int e = -1;

   public dpw(ja $$0, dsh $$1) {
      super(dpp.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dsh $$1 = this.n();

         for (int $$2 = 0; $$2 < dgj.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dsy $$4 = dgj.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dxa.c, this.o, dxa.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bpx.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      bpx.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cua::e)).count();
   }

   @Override
   public void a() {
      this.d.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean c() {
      return this.d.stream().allMatch(cua::e);
   }

   @Override
   public cua a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      cua $$2 = Objects.requireNonNullElse(this.d.get($$0), cua.l);
      this.d.set($$0, cua.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cua b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cua $$1) {
      if ($$1.a(awd.aW)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bpw $$0, int $$1, cua $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cua.c($$2, $$2x) && $$2x.H() + $$2.H() <= $$0.e_($$2x));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(cmh $$0) {
      return bpw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cua $$1) {
      return $$1.a(awd.aW) && this.a($$0).e() && $$1.H() == this.ah_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dpn.b $$0) {
      super.a($$0);
      $$0.a(kn.aa, cwv.a).a(this.d);
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.aa, cwv.a(this.d));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("Items");
   }
}
