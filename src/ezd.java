public class ezd extends ezf {
   private final jl b;
   private final jg c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static ezd a(ezh $$0, jl $$1, jg $$2) {
      return new ezd(true, $$0, $$1, $$2, false, false);
   }

   public ezd(ezh $$0, jl $$1, jg $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public ezd(ezh $$0, jl $$1, jg $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private ezd(boolean $$0, ezh $$1, jl $$2, jg $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public ezd a(jl $$0) {
      return new ezd(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public ezd a(jg $$0) {
      return new ezd(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public ezd a() {
      return new ezd(this.d, this.a, this.b, this.c, this.e, true);
   }

   public jg b() {
      return this.c;
   }

   public jl c() {
      return this.b;
   }

   @Override
   public ezf.a d() {
      return this.d ? ezf.a.a : ezf.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
