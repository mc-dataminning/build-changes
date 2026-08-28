import com.mojang.serialization.Codec;
import java.util.Optional;

public record dbr(cxt<dhf> c) {
   public static final Codec<dbr> a = cxt.a(mg.bi, dhf.c).xmap(dbr::new, dbr::a);
   public static final yu<wh, dbr> b = cxt.a(mg.bi, dhf.d).a(dbr::new, dbr::a);

   public dbr(je<dhf> $$0) {
      this(new cxt<>($$0));
   }

   @Deprecated
   public dbr(ald<dhf> $$0) {
      this(new cxt<>($$0));
   }

   public Optional<je<dhf>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cxt<dhf> a() {
      return this.c;
   }
}
