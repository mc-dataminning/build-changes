import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends dil implements djo {
   public static final MapCodec<djc> c = b(djc::new);

   @Override
   public MapCodec<djc> a() {
      return c;
   }

   protected djc(drz.d $$0) {
      super($$0, je.b, ewf.b(), true);
   }

   @Override
   protected dim c() {
      return (dim)dez.mc;
   }

   @Override
   protected ent b_(dsa $$0) {
      return enu.c.a(false);
   }

   @Override
   protected boolean m(dsa $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return false;
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      return false;
   }
}
