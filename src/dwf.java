import com.mojang.serialization.Codec;

public class dwf extends dwb {
   public static final Codec<dwf> a = asq.j.fieldOf("chance").xmap(dwf::new, $$0 -> $$0.c).codec();
   private final int c;

   private dwf(int $$0) {
      this.c = $$0;
   }

   public static dwf a(int $$0) {
      return new dwf($$0);
   }

   @Override
   protected boolean a(dwa $$0, ato $$1, ht $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dwd<?> b() {
      return dwd.b;
   }
}
