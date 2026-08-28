import com.mojang.serialization.Codec;
import java.util.Optional;

public record dcz(czb<din> c) {
   public static final Codec<dcz> a = czb.a(mi.bk, din.c).xmap(dcz::new, dcz::a);
   public static final za<wn, dcz> b = czb.a(mi.bk, din.d).a(dcz::new, dcz::a);

   public dcz(jg<din> $$0) {
      this(new czb<>($$0));
   }

   @Deprecated
   public dcz(alj<din> $$0) {
      this(new czb<>($$0));
   }

   public Optional<jg<din>> a(ji.a $$0) {
      return this.c.a($$0);
   }

   public czb<din> a() {
      return this.c;
   }
}
