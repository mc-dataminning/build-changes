import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class fgz {
   public boolean a(@Nullable fgz $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract xq d(xc var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract fgz.b k();

   public abstract o o();

   public abstract Collection<String> h();

   public abstract fgz.b l();

   public abstract fgz.a m();

   public static enum a implements bao {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<fgz.a> e = bao.a(fgz.a::values);
      private static final IntFunction<fgz.a> i = ayg.a($$0 -> $$0.h, values(), ayg.a.a);
      public static final za<ByteBuf, fgz.a> f = yy.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xc a() {
         return xc.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bao {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<fgz.b> e = bao.a(fgz.b::values);
      private static final IntFunction<fgz.b> i = ayg.a($$0 -> $$0.h, values(), ayg.a.a);
      public static final za<ByteBuf, fgz.b> f = yy.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xc a() {
         return xc.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
