import javax.annotation.Nullable;

public class bot {
   private final il<bov> a;
   @Nullable
   private final bpv b;
   @Nullable
   private final bpv c;
   @Nullable
   private final esa d;

   @Override
   public String toString() {
      return "DamageSource (" + this.j().a() + ")";
   }

   public float a() {
      return this.j().c();
   }

   public boolean b() {
      return this.b != this.c;
   }

   private bot(il<bov> $$0, @Nullable bpv $$1, @Nullable bpv $$2, @Nullable esa $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bot(il<bov> $$0, @Nullable bpv $$1, @Nullable bpv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bot(il<bov> $$0, esa $$1) {
      this($$0, null, null, $$1);
   }

   public bot(il<bov> $$0, @Nullable bpv $$1) {
      this($$0, $$1, $$1);
   }

   public bot(il<bov> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bpv c() {
      return this.c;
   }

   @Nullable
   public bpv d() {
      return this.b;
   }

   public wg a(bqo $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bqo $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wg.a($$6, $$0.O_(), $$5.O_()) : wg.a($$1, $$0.O_());
      } else {
         wg $$2 = this.b == null ? this.c.O_() : this.b.O_();
         crj $$4 = this.b instanceof bqo $$3 ? $$3.eU() : crj.i;
         return !$$4.d() && $$4.b(jp.d) ? wg.a($$1 + ".item", $$0.O_(), $$2, $$4.E()) : wg.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bqo && !(this.b instanceof cjt);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cjt $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public esa h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public esa i() {
      return this.d;
   }

   public boolean a(avr<bov> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ajs<bov> $$0) {
      return this.a.a($$0);
   }

   public bov j() {
      return this.a.a();
   }

   public il<bov> k() {
      return this.a;
   }
}
