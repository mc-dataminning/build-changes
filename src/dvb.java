import com.mojang.serialization.Codec;

public class dvb extends dvc {
   public static final dvb a = new dvb(dmz.a(0));
   public static final Codec<dvb> b = asq.e(dmz.a, dmz.a.fieldOf("value").codec()).xmap(dvb::new, dvb::b);
   private final dmz d;

   public static dvb a(dmz $$0) {
      return new dvb($$0);
   }

   private dvb(dmz $$0) {
      this.d = $$0;
   }

   public dmz b() {
      return this.d;
   }

   @Override
   public int a(ato $$0, dnc $$1) {
      return this.d.a($$1);
   }

   @Override
   public dvd<?> a() {
      return dvd.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
