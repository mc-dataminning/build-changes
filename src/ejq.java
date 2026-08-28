import com.mojang.serialization.Codec;

public class ejq implements ejv {
   public static final Codec<ejq> a = bsv.b(0, 256).fieldOf("count").xmap(ejq::new, ejq::a).codec();
   private final bsv b;

   public ejq(int $$0) {
      this.b = bss.a($$0);
   }

   public ejq(bsv $$0) {
      this.b = $$0;
   }

   public bsv a() {
      return this.b;
   }
}
