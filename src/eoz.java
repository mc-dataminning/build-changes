import com.mojang.serialization.MapCodec;

public class eoz extends epa {
   public static final eoz a = new eoz(egs.a(0));
   public static final MapCodec<eoz> b = egs.a.fieldOf("value").xmap(eoz::new, eoz::b);
   private final egs d;

   public static eoz a(egs $$0) {
      return new eoz($$0);
   }

   private eoz(egs $$0) {
      this.d = $$0;
   }

   public egs b() {
      return this.d;
   }

   @Override
   public int a(azv $$0, egv $$1) {
      return this.d.a($$1);
   }

   @Override
   public epb<?> a() {
      return epb.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
