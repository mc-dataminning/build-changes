import com.mojang.serialization.MapCodec;

public class egi extends egw {
   public static final MapCodec<egi> a = bpb.b(0, 256).fieldOf("count").xmap(egi::new, $$0 -> $$0.c);
   private final bpb c;

   private egi(bpb $$0) {
      this.c = $$0;
   }

   public static egi a(bpb $$0) {
      return new egi($$0);
   }

   public static egi a(int $$0) {
      return a(boy.a($$0));
   }

   @Override
   protected int a(aym $$0, io $$1) {
      return this.c.a($$0);
   }

   @Override
   public egt<?> b() {
      return egt.f;
   }
}
