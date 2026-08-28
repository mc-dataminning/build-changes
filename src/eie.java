import com.mojang.serialization.MapCodec;

public class eie extends ehv {
   public static final MapCodec<eie> b = duo.a.fieldOf("state").xmap(eie::new, $$0 -> $$0.c);
   private final duo c;

   protected eie(duo $$0) {
      this.c = $$0;
   }

   @Override
   protected ehw<?> a() {
      return ehw.a;
   }

   @Override
   public duo a(azl $$0, je $$1) {
      return this.c;
   }
}
