import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cg(cl.d b) {
   public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group(arh.a(cl.d.d, "light", cl.d.c).forGetter(cg::a)).apply($$0, cg::new));

   public boolean a(aks $$0, gw $$1) {
      return !$$0.o($$1) ? false : this.b.d($$0.z($$1));
   }

   public cl.d a() {
      return this.b;
   }

   public static class a {
      private cl.d a = cl.d.c;

      public static cg.a a() {
         return new cg.a();
      }

      public cg.a a(cl.d $$0) {
         this.a = $$0;
         return this;
      }

      public cg b() {
         return new cg(this.a);
      }
   }
}
