import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fox extends fow {
   static fox.a a(GameProfile $$0, vw $$1, fov $$2) {
      return new fox.a($$0, $$1, $$2);
   }

   static fox.b a(vg $$0, Instant $$1) {
      return new fox.b($$0, $$1);
   }

   vg b();

   default vg c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vw d, fov e) implements fox {
      public static final Codec<fox.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atx.u.fieldOf("profile").forGetter(fox.a::f), vw.a.forGetter(fox.a::g), fov.d.optionalFieldOf("trust_level", fov.a).forGetter(fox.a::h)
               )
               .apply($$0, fox.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vg b() {
         if (!this.d.o().a()) {
            vg $$0 = this.d.o().b(this.d.c());
            return (vg)($$0 != null ? $$0 : vg.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public vg c() {
         vg $$0 = this.b();
         vg $$1 = this.i();
         return vg.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vg d() {
         vg $$0 = this.i();
         return vg.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vg i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return vg.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fow.a a() {
         return fow.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vw g() {
         return this.d;
      }

      public fov h() {
         return this.e;
      }
   }

   public static record b(vg c, Instant d) implements fox {
      public static final Codec<fox.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vi.a.fieldOf("message").forGetter(fox.b::d), atx.m.fieldOf("time_stamp").forGetter(fox.b::e)).apply($$0, fox.b::new)
      );

      @Override
      public vg b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fow.a a() {
         return fow.a.b;
      }

      public vg d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
