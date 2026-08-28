import com.mojang.serialization.Codec;
import java.util.Optional;

public record dcc(cye<dhq> c) {
   public static final Codec<dcc> a = cye.a(mg.bk, dhq.c).xmap(dcc::new, dcc::a);
   public static final yw<wj, dcc> b = cye.a(mg.bk, dhq.d).a(dcc::new, dcc::a);

   public dcc(je<dhq> $$0) {
      this(new cye<>($$0));
   }

   @Deprecated
   public dcc(alf<dhq> $$0) {
      this(new cye<>($$0));
   }

   public Optional<je<dhq>> a(jg.a $$0) {
      return this.c.a($$0);
   }

   public cye<dhq> a() {
      return this.c;
   }
}
