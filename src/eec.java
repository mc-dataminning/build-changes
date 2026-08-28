import com.mojang.serialization.Codec;

public class eec implements eeh {
   public static final Codec<eec> a = bpw.b(0, 256).fieldOf("count").xmap(eec::new, eec::a).codec();
   private final bpw b;

   public eec(int $$0) {
      this.b = bpt.a($$0);
   }

   public eec(bpw $$0) {
      this.b = $$0;
   }

   public bpw a() {
      return this.b;
   }
}
