import com.mojang.serialization.Codec;

public class eev extends eew {
   public static final eev a = new eev(dwt.a(0));
   public static final Codec<eev> b = axh.e(dwt.a, dwt.a.fieldOf("value").codec()).xmap(eev::new, eev::b);
   private final dwt d;

   public static eev a(dwt $$0) {
      return new eev($$0);
   }

   private eev(dwt $$0) {
      this.d = $$0;
   }

   public dwt b() {
      return this.d;
   }

   @Override
   public int a(ayg $$0, dww $$1) {
      return this.d.a($$1);
   }

   @Override
   public eex<?> a() {
      return eex.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
