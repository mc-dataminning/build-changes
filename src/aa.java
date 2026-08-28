import org.apache.commons.lang3.StringEscapeUtils;

public class aa extends RuntimeException {
   public aa(String $$0) {
      super(StringEscapeUtils.escapeJava($$0));
   }

   public aa(String $$0, Throwable $$1) {
      super(StringEscapeUtils.escapeJava($$0), $$1);
   }
}
