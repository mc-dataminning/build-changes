import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface foi extends foh {
   static foi.a a(GameProfile $$0, vv $$1, fog $$2) {
      return new foi.a($$0, $$1, $$2);
   }

   static foi.b a(vf $$0, Instant $$1) {
      return new foi.b($$0, $$1);
   }

   vf b();

   default vf c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vv d, fog e) implements foi {
      public static final Codec<foi.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.u.fieldOf("profile").forGetter(foi.a::f), vv.a.forGetter(foi.a::g), fog.d.optionalFieldOf("trust_level", fog.a).forGetter(foi.a::h)
               )
               .apply($$0, foi.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vf b() {
         if (!this.d.n().a()) {
            vf $$0 = this.d.n().b(this.d.b());
            return (vf)($$0 != null ? $$0 : vf.i());
         } else {
            return this.d.c();
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
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
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
      public foh.a a() {
         return foh.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vv g() {
         return this.d;
      }

      public fog h() {
         return this.e;
      }
   }

   public static record b(vf c, Instant d) implements foi {
      public static final Codec<foi.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vh.a.fieldOf("message").forGetter(foi.b::d), atv.m.fieldOf("time_stamp").forGetter(foi.b::e)).apply($$0, foi.b::new)
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
      public foh.a a() {
         return foh.a.b;
      }

      public vf d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
