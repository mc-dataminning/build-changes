import com.mojang.serialization.Codec;

public class edb extends ect {
   public static final Codec<edb> a = asq.a(ke.f).fieldOf("tag").xmap(edb::new, $$0 -> $$0.b).codec();
   private final asq<cwj> b;

   public edb(asq<cwj> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dja $$0, aup $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ecu<?> a() {
      return ecu.d;
   }
}
