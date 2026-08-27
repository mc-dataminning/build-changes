import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eha extends ego {
   public static final Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eix.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eha::new)
   );
   private final eiw b;
   private final boolean c;

   private eha(List<eib> $$0, eiw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public egq b() {
      return egr.c;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.a();
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(atq.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static ego.a<?> a(eiw $$0) {
      return a($$1 -> new eha($$1, $$0, false));
   }

   public static ego.a<?> a(eiw $$0, boolean $$1) {
      return a($$2 -> new eha($$2, $$0, $$1));
   }
}
