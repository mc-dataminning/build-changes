import java.util.List;

public record aau(alc<dhp> c, eoy d, List<aau.a> e) implements aaf {
   public static final yt<vr, aau> a = aaf.a(aau::a, aau::new);
   public static final aaf.b<aau> b = aaf.a("debug/structures");

   private aau(vr $$0) {
      this($$0.a(me.bl), b($$0), $$0.a(aau.a::new));
   }

   private void a(vr $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aaf.b<aau> a() {
      return b;
   }

   static eoy b(vr $$0) {
      return new eoy($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vr $$0, eoy $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alc<dhp> b() {
      return this.c;
   }

   public eoy c() {
      return this.d;
   }

   public List<aau.a> d() {
      return this.e;
   }

   public static record a(eoy a, boolean b) {
      public a(vr $$0) {
         this(aau.b($$0), $$0.readBoolean());
      }

      public void a(vr $$0) {
         aau.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
