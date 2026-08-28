import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eol extends eos {
   public static final MapCodec<eol> a = MapCodec.unit(() -> eol.b);
   public static final eol b = new eol();

   private eol() {
      super(eou.a.a);
   }

   @Override
   public km a(ern $$0, dqc $$1) {
      return km.h;
   }

   @Override
   public List<erm.a> a(ern $$0, ji $$1, dqc $$2, azg $$3) {
      return Collections.emptyList();
   }

   @Override
   public enc a(ern $$0, ji $$1, dqc $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ern $$0, dhe $$1, dhc $$2, dyr $$3, ji $$4, ji $$5, dqc $$6, enc $$7, azg $$8, eqw $$9, boolean $$10) {
      return true;
   }

   @Override
   public eot<?> a() {
      return eot.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
