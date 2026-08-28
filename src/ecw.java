import com.mojang.serialization.Codec;

public class ecw implements edb {
   public static final Codec<ecw> a = bpy.b(0, 256).fieldOf("count").xmap(ecw::new, ecw::a).codec();
   private final bpy b;

   public ecw(int $$0) {
      this.b = bpv.a($$0);
   }

   public ecw(bpy $$0) {
      this.b = $$0;
   }

   public bpy a() {
      return this.b;
   }
}
