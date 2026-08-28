import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxp implements cqn {
   public static final Codec<jo<cxp>> a = lv.h.r();
   public static final zc<wp, jo<cxp>> b = za.b(lw.ad);
   @Nullable
   private final String c;
   private final List<bsy> d;
   private cqq e = cqs.h;

   public cxp(bsy... $$0) {
      this(null, $$0);
   }

   public cxp(@Nullable String $$0, bsy... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cxp a(cqo... $$0) {
      this.e = cqs.f.a($$0);
      return this;
   }

   @Override
   public cqq i() {
      return this.e;
   }

   public static String a(Optional<jo<cxp>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jo::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsy> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (bsy $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
