import com.mojang.serialization.Codec;

public class eiq extends eje {
   public static final Codec<eiq> a = bpf.b(0, 256).fieldOf("count").xmap(eiq::new, $$0 -> $$0.c).codec();
   private final bpf c;

   private eiq(bpf $$0) {
      this.c = $$0;
   }

   public static eiq a(bpf $$0) {
      return new eiq($$0);
   }

   public static eiq a(int $$0) {
      return a(bpc.a($$0));
   }

   @Override
   protected int a(ayt $$0, ir $$1) {
      return this.c.a($$0);
   }

   @Override
   public ejb<?> b() {
      return ejb.f;
   }
}
