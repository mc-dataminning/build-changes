import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fqy extends fqx {
   static fqy.a a(GameProfile $$0, wg $$1, fqw $$2) {
      return new fqy.a($$0, $$1, $$2);
   }

   static fqy.b a(vq $$0, Instant $$1) {
      return new fqy.b($$0, $$1);
   }

   vq b();

   default vq c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, wg d, fqw e) implements fqy {
      public static final Codec<fqy.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.u.fieldOf("profile").forGetter(fqy.a::f), wg.a.forGetter(fqy.a::g), fqw.d.optionalFieldOf("trust_level", fqw.a).forGetter(fqy.a::h)
               )
               .apply($$0, fqy.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vq b() {
         if (!this.d.o().a()) {
            vq $$0 = this.d.o().b(this.d.c());
            return (vq)($$0 != null ? $$0 : vq.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public vq c() {
         vq $$0 = this.b();
         vq $$1 = this.i();
         return vq.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vq d() {
         vq $$0 = this.i();
         return vq.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vq i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return vq.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fqx.a a() {
         return fqx.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public wg g() {
         return this.d;
      }

      public fqw h() {
         return this.e;
      }
   }

   public static record b(vq c, Instant d) implements fqy {
      public static final Codec<fqy.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vs.a.fieldOf("message").forGetter(fqy.b::d), avq.m.fieldOf("time_stamp").forGetter(fqy.b::e)).apply($$0, fqy.b::new)
      );

      @Override
      public vq b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fqx.a a() {
         return fqx.a.b;
      }

      public vq d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
