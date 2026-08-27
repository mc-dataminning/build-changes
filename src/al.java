import com.mojang.serialization.Codec;

public enum al implements ayg {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = ayg.a(al::values);
   private final String e;
   private final n f;
   private final wi g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wi.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wi b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public ww a(af $$0, apv $$1) {
      return wi.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
