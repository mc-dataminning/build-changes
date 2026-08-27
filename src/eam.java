import com.mojang.serialization.Codec;

public class eam extends ean {
   public static final eam a = new eam(dsk.a(0));
   public static final Codec<eam> b = avu.e(dsk.a, dsk.a.fieldOf("value").codec()).xmap(eam::new, eam::b);
   private final dsk d;

   public static eam a(dsk $$0) {
      return new eam($$0);
   }

   private eam(dsk $$0) {
      this.d = $$0;
   }

   public dsk b() {
      return this.d;
   }

   @Override
   public int a(awt $$0, dsn $$1) {
      return this.d.a($$1);
   }

   @Override
   public eao<?> a() {
      return eao.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
