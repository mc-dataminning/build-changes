import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cef {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cef> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kb.y.q().fieldOf("type").orElseGet(() -> cej.c).forGetter($$0x -> $$0x.e),
               kb.z.q().fieldOf("profession").orElseGet(() -> ceh.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, cef::new)
   );
   private final cej e;
   private final ceh f;
   private final int g;

   public cef(cej $$0, ceh $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public cej a() {
      return this.e;
   }

   public ceh b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public cef a(cej $$0) {
      return new cef($$0, this.f, this.g);
   }

   public cef a(ceh $$0) {
      return new cef(this.e, $$0, this.g);
   }

   public cef a(int $$0) {
      return new cef(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? d[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? d[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
