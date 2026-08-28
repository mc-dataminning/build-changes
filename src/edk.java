import com.mojang.serialization.Codec;

public class edk implements edp {
   public static final Codec<edk> a = bpm.b(0, 256).fieldOf("count").xmap(edk::new, edk::a).codec();
   private final bpm b;

   public edk(int $$0) {
      this.b = bpj.a($$0);
   }

   public edk(bpm $$0) {
      this.b = $$0;
   }

   public bpm a() {
      return this.b;
   }
}
