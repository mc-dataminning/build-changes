import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface ffk extends ffj {
   static ffk.a a(GameProfile $$0, tl $$1, ffi $$2) {
      return new ffk.a($$0, $$1, $$2);
   }

   static ffk.b a(sw $$0, Instant $$1) {
      return new ffk.b($$0, $$1);
   }

   sw b();

   default sw c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, tl d, ffi e) implements ffk {
      public static final Codec<ffk.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aoi.t.fieldOf("profile").forGetter(ffk.a::f), tl.a.forGetter(ffk.a::g), ffi.d.optionalFieldOf("trust_level", ffi.a).forGetter(ffk.a::h)
               )
               .apply($$0, ffk.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public sw b() {
         if (!this.d.n().a()) {
            sw $$0 = this.d.n().b(this.d.b());
            return (sw)($$0 != null ? $$0 : sw.h());
         } else {
            return this.d.c();
         }
      }

      @Override
      public sw c() {
         sw $$0 = this.b();
         sw $$1 = this.i();
         return sw.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public sw d() {
         sw $$0 = this.i();
         return sw.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private sw i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return sw.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public ffj.a a() {
         return ffj.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public tl g() {
         return this.d;
      }

      public ffi h() {
         return this.e;
      }
   }

   public static record b(sw c, Instant d) implements ffk {
      public static final Codec<ffk.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(aoi.b.fieldOf("message").forGetter(ffk.b::d), aoi.m.fieldOf("time_stamp").forGetter(ffk.b::e)).apply($$0, ffk.b::new)
      );

      @Override
      public sw b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public ffj.a a() {
         return ffj.a.b;
      }

      public sw d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
