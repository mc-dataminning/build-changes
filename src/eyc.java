import com.google.common.collect.Lists;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class eyc {
   public static List<eze> a(eyc.a... $$0) {
      for (eyc.a $$1 : $$0) {
         a($$1.j);
      }

      List<eze> $$2 = Lists.newArrayList();

      for (eyc.a $$3 : $$0) {
         $$2.add(new eze($$3.i, a($$3.j)));
      }

      $$2.sort(Comparator.comparingInt(eze::a));
      return $$2;
   }

   private static int a(String $$0) {
      int $$1 = 700;
      long $$2 = 0L;
      Socket $$3 = null;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         try {
            SocketAddress $$5 = new InetSocketAddress($$0, 80);
            $$3 = new Socket();
            long $$6 = b();
            $$3.connect($$5, 700);
            $$2 += b() - $$6;
         } catch (Exception var12) {
            $$2 += 700L;
         } finally {
            IOUtils.closeQuietly($$3);
         }
      }

      return (int)((double)$$2 / 5.0);
   }

   private static long b() {
      return ac.b();
   }

   public static List<eze> a() {
      return a(eyc.a.values());
   }

   static enum a {
      a("us-east-1", "ec2.us-east-1.amazonaws.com"),
      b("us-west-2", "ec2.us-west-2.amazonaws.com"),
      c("us-west-1", "ec2.us-west-1.amazonaws.com"),
      d("eu-west-1", "ec2.eu-west-1.amazonaws.com"),
      e("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com"),
      f("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com"),
      g("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com"),
      h("sa-east-1", "ec2.sa-east-1.amazonaws.com");

      final String i;
      final String j;

      private a(String $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }
   }
}
