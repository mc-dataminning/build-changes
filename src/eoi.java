import com.mojang.serialization.MapCodec;

public class eoi extends eoy {
   public static final MapCodec<eoi> a = duo.a.fieldOf("block_state").xmap(eoi::new, $$0 -> $$0.b);
   private final duo b;

   public eoi(duo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eoz<?> a() {
      return eoz.c;
   }
}
