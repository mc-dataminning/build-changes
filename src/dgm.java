import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgm extends dex {
   public static final MapCodec<dex> a = lp.e.q().fieldOf("dead");
   public static final MapCodec<dgm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgm::new));
   private final dex c;

   public dgm(dex $$0, drz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgm> a() {
      return b;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbc $$0, iz $$1) {
      for (je $$2 : je.values()) {
         ent $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
