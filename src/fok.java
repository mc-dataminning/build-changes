import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fok extends foj {
   static fok.a a(GameProfile $$0, vv $$1, foi $$2) {
      return new fok.a($$0, $$1, $$2);
   }

   static fok.b a(vf $$0, Instant $$1) {
      return new fok.b($$0, $$1);
   }

   vf b();

   default vf c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vv d, foi e) implements fok {
      public static final Codec<fok.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.u.fieldOf("profile").forGetter(fok.a::f), vv.a.forGetter(fok.a::g), foi.d.optionalFieldOf("trust_level", foi.a).forGetter(fok.a::h)
               )
               .apply($$0, fok.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vf b() {
         if (!this.d.o().a()) {
            vf $$0 = this.d.o().b(this.d.c());
            return (vf)($$0 != null ? $$0 : vf.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public vf c() {
         vf $$0 = this.b();
         vf $$1 = this.i();
         return vf.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vf d() {
         vf $$0 = this.i();
         return vf.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vf i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return vf.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public foj.a a() {
         return foj.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vv g() {
         return this.d;
      }

      public foi h() {
         return this.e;
      }
   }

   public static record b(vf c, Instant d) implements fok {
      public static final Codec<fok.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vh.a.fieldOf("message").forGetter(fok.b::d), atw.m.fieldOf("time_stamp").forGetter(fok.b::e)).apply($$0, fok.b::new)
      );

      @Override
      public vf b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public foj.a a() {
         return foj.a.b;
      }

      public vf d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
