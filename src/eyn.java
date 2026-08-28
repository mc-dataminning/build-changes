import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eyn {
   private final eyq a;
   private final azt b;
   private final jf.a c;
   private final Set<eyn.c<?>> d = Sets.newLinkedHashSet();

   eyn(eyq $$0, azt $$1, jf.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bav<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bav<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bav<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(ale $$0, Consumer<cys> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(eyn.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eyn.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eyn.c<?> $$0) {
      this.d.remove($$0);
   }

   public jf.a a() {
      return this.c;
   }

   public azt b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public aro d() {
      return this.a.a();
   }

   public static eyn.c<eys> a(eys $$0) {
      return new eyn.c<>(eyp.c, $$0);
   }

   public static eyn.c<fbw> a(fbw $$0) {
      return new eyn.c<>(eyp.a, $$0);
   }

   public static eyn.c<fab> a(fab $$0) {
      return new eyn.c<>(eyp.b, $$0);
   }

   public static class a {
      private final eyq a;
      @Nullable
      private azt b;

      public a(eyq $$0) {
         this.a = $$0;
      }

      public eyn.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azt.a($$0);
         }

         return this;
      }

      public eyn.a a(azt $$0) {
         this.b = $$0;
         return this;
      }

      public aro a() {
         return this.a.a();
      }

      public eyn a(Optional<ale> $$0) {
         aro $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azt $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new eyn(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bai {
      a("this", fbh.a),
      b("attacker", fbh.d),
      c("direct_attacker", fbh.e),
      d("attacking_player", fbh.b);

      public static final bai.a<eyn.b> e = bai.a(eyn.b::values);
      private final String f;
      private final bav<? extends bwa> g;

      private b(final String $$0, final bav<? extends bwa> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bav<? extends bwa> a() {
         return this.g;
      }

      public static eyn.b a(String $$0) {
         eyn.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(eyp<T> a, T b) {
   }
}
