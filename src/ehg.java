import com.mojang.serialization.MapCodec;

public class ehg extends ehu {
   public static final MapCodec<ehg> a = bpy.b(0, 256).fieldOf("count").xmap(ehg::new, $$0 -> $$0.c);
   private final bpy c;

   private ehg(bpy $$0) {
      this.c = $$0;
   }

   public static ehg a(bpy $$0) {
      return new ehg($$0);
   }

   public static ehg a(int $$0) {
      return a(bpv.a($$0));
   }

   @Override
   protected int a(azg $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehr<?> b() {
      return ehr.f;
   }
}
